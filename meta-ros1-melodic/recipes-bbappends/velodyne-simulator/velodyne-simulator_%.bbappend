# Copyright (c) 2020 LG Electronics, Inc.

PNBLACKLIST[velodyne-simulator] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'gazebo', 'Depends on gazebo, velodyne-gazebo-plugins which is not available', '', d)}"
