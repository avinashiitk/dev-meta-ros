# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "CMake shim over the poco library."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0 & Boost-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=401a7342a877608092ef332b6948eb03"

ROS_CN = "poco_vendor"
ROS_BPN = "poco_vendor"

ROS_BUILD_DEPENDS = " \
    libpcre \
    poco \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libpcre \
    poco \
    zlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    cmake-native \
"

ROS_EXEC_DEPENDS = " \
    libpcre \
    poco \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/poco_vendor-release/archive/release/dashing/poco_vendor/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/poco_vendor"
SRC_URI = "git://github.com/ros2-gbp/poco_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "7b696337be24bae2c78de417a79b98a78ccdeffd"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('poco-vendor', d)}"
ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
