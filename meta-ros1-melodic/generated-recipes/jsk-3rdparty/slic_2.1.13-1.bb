# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "SLIC-Superpizel ROS Wrapper   This file contains the class elements of the class Slic. This class is an   implementation of the SLIC Superpixel algorithm by Achanta et al. [PAMI'12,   vol. 34, num. 11, pp. 2274-2282].    This implementation is created for the specific purpose of creating   over-segmentations in an OpenCV-based environment."
AUTHOR = "Kei Okada <k-okada@jsk.imi.i.u-tokyo.ac.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "N-A"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=05621664bc3a8e6d6781cb1e0156ed33"

ROS_CN = "jsk_3rdparty"
ROS_BPN = "slic"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ca-certificates} \
    cmake-modules \
    git \
    opencv \
    openssl \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    opencv \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    opencv \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/slic/2.1.13-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/slic"
SRC_URI = "git://github.com/tork-a/jsk_3rdparty-release;${ROS_BRANCH};protocol=https"
SRCREV = "0d69503cbe929ffc1813f1ebba583aa025a937d3"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('jsk-3rdparty', d)}"
ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
