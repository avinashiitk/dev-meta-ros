# Copyright (c) 2020 LG Electronics, Inc.

PNBLACKLIST[rc-cloud-accumulator] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt5', 'Requires libvtk-qt which is not available', '', d)}"
