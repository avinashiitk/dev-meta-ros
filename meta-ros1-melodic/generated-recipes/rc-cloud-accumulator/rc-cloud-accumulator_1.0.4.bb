# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A viewer for the SLAM component of roboception based on ROS and PCL"
AUTHOR = "Felix Endres <felix.endres@roboception.de>"
ROS_AUTHOR = "Felix Endres <felix.endres@roboception.de>"
HOMEPAGE = "https://wiki.ros.org/rc_cloud_accumulator"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_cloud_accumulator"
ROS_BPN = "rc_cloud_accumulator"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libvtk-qt} \
    geometry-msgs \
    nav-msgs \
    pcl \
    pcl-ros \
    roscpp \
    std-srvs \
    tf2 \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libvtk-qt} \
    geometry-msgs \
    nav-msgs \
    pcl \
    pcl-ros \
    roscpp \
    std-srvs \
    tf2 \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libvtk-qt} \
    geometry-msgs \
    nav-msgs \
    pcl \
    pcl-ros \
    roscpp \
    std-srvs \
    tf2 \
    tf2-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboception-gbp/rc_cloud_accumulator-release/archive/release/melodic/rc_cloud_accumulator/1.0.4-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rc_cloud_accumulator"
SRC_URI = "git://github.com/roboception-gbp/rc_cloud_accumulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "cc78b3e777393972d86c57e9d958f000a39588f3"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rc-cloud-accumulator', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
