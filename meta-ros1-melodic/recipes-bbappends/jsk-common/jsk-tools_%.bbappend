# Copyright (c) 2019-2020 LG Electronics, Inc.

PNBLACKLIST[jsk-tools] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt5', 'Requires rqt-reconfigure which depends on python-qt-binding which requires meta-qt5 to be included', '', d)}"
