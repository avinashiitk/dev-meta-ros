# Copyright (c) 2019-2020 LG Electronics, Inc.

PNBLACKLIST[abb] ?= "${@bb.utils.contains_any('ROS_WORLD_SKIP_GROUPS', ['qt5', 'ogre'], 'Requires abb-irb6640-moveit-config which depends on moveit-ros-visualization which depends on qtbase which requires meta-qt5 to be included and depends on abb-irb2400-moveit-config which depends on ogre which is not available', '', d)}"
