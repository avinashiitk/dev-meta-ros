# Copyright (c) 2020 LG Electronics, Inc.

PNBLACKLIST[gazebo-ros] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'gazebo', 'Depends on gazebo, gazebo-ros which is not available', '', d)}"
