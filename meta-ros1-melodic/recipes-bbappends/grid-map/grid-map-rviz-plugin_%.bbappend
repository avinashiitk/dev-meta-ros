# Copyright (c) 2019-2020 LG Electronics, Inc.

PNBLACKLIST[grid-map-rviz-plugin] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt5', 'Requires qtbase which requires meta-qt5 to be included', '', d)}"