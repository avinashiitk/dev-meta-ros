# Copyright (c) 2019-2020 LG Electronics, Inc.

PNBLACKLIST[pr2eus-tutorials] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt5', 'Requires jsk-pcl-ros which depends on jsk-recognition-utils which depends on qtbase which requires meta-qt5 to be included', '', d)}"
