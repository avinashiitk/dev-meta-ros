# Copyright (c) 2019-2020 LG Electronics, Inc.

PNBLACKLIST[towr-ros] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt5', 'Requires rqt-bag which depends on python-qt-binding which requires meta-qt5 to be included', 'depends on towr which depends on ifopt which depends on unavailable UNRESOLVED-coinor-libipopt-dev', d)}"
