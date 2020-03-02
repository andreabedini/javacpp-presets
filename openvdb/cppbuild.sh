#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script

set -e

if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" openvdb
    popd
    exit
fi

OPENVDB_VERSION=7.0.0
download https://github.com/AcademySoftwareFoundation/openvdb/archive/v$OPENVDB_VERSION.tar.gz openvdb-$OPENVDB_VERSION.tar.gz

mkdir -p "$PLATFORM"
cd "$PLATFORM"
INSTALL_PATH=$(pwd)

echo "Decompressing archives..."
tar --totals -xzf ../openvdb-$OPENVDB_VERSION.tar.gz

cd openvdb-$OPENVDB_VERSION

case $PLATFORM in
    linux-x86_64|macosx-*|windows-x86_64)
      mkdir -p ../build
      cd ../build
      "$CMAKE" -DCMAKE_BUILD_TYPE=Release -DCMAKE_INSTALL_PREFIX=.. ../openvdb-$OPENVDB_VERSION
      make
      make install
      ;;
    *)
      echo "Error: Platform \"$PLATFORM\" is not supported"
      ;;
esac

cd ../..
