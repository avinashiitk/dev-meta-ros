# Copyright (c) 2019-2020 LG Electronics, Inc.

PNBLACKLIST[moveit-ros-visualization] ?= "${@bb.utils.contains_any('ROS_WORLD_SKIP_GROUPS', ['qt5', 'ogre'], 'Requires qtbase which requires meta-qt5 to be included and ogre which is not available', '', d)}"
