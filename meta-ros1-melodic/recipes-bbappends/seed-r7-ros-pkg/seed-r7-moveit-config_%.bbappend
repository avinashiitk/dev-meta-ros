# Copyright (c) 2019-2020 LG Electronics, Inc.

PNBLACKLIST[seed-r7-moveit-config] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt5', 'Requires moveit-ros-visualization which depends on qtbase which requires meta-qt5 to be included', '', d)}"
