#!/bin/bash


os_type="UNKNOWN OS"

find_os_type() {
  case "$OSTYPE" in
  linux*)  os_type="linux";;
  darwin*) os_type="osx";;
  msys*)   os_type="windows";;
  *)       os_type=$OSTYPE;;
  esac
}

find_os_type
printf $os_type