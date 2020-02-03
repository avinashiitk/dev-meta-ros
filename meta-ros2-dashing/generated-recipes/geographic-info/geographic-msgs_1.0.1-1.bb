# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "ROS messages for Geographic Information Systems."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
ROS_AUTHOR = "Jack O'Quin"
HOMEPAGE = "http://wiki.ros.org/geographic_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geographic_info"
ROS_BPN = "geographic_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    rosidl-default-generators \
    std-msgs \
    unique-identifier-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    std-msgs \
    unique-identifier-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rosidl-default-runtime \
    std-msgs \
    unique-identifier-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-geographic-info/geographic_info-release/archive/release/dashing/geographic_msgs/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/geographic_msgs"
SRC_URI = "git://github.com/ros-geographic-info/geographic_info-release;${ROS_BRANCH};protocol=https"
SRCREV = "bd0382e391fa0c3a98ca384d356f1693c807f089"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
