# Copyright (c) 2020 LG Electronics, Inc.

PNBLACKLIST[handeye] ?= "${@bb.utils.contains_any('ROS_WORLD_SKIP_GROUPS', ['vc4graphics-without-opengl', 'python-deps'], 'Depends on gstreamer1.0-plugins-base which is not available for raspberrypi MACHINEs with vc4graphics in MACHINE_FEATURES, but without opengl in DISTRO_FEATURES and depends on criutils which depends on unavailable UNRESOLVED-python-termcolor', '', d)}"
