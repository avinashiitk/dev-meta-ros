# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "OMPL is a free sampling-based motion planning library."
AUTHOR = "Mark Moll <mmoll@rice.edu>"
ROS_AUTHOR = "Kavraki Lab"
HOMEPAGE = "http://ompl.kavrakilab.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ompl"
ROS_BPN = "ompl"

ROS_BUILD_DEPENDS = " \
    boost \
    cmake \
    libeigen \
    pkgconfig \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ompl-release/archive/release/melodic/ompl/1.4.2-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ompl"
SRC_URI = "git://github.com/ros-gbp/ompl-release;${ROS_BRANCH};protocol=https"
SRCREV = "0d30b5953de9c08642d7837d31e758efc3c44b49"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ompl', d)}"
ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
