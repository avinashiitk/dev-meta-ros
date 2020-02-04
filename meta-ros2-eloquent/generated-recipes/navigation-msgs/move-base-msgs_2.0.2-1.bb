# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "Holds the action description and relevant messages for the move_base package."
AUTHOR = "Steve Macenski <stevenmacenski@gmail.com>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://wiki.ros.org/move_base_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "navigation_msgs"
ROS_BPN = "move_base_msgs"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    rosidl-default-generators \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
    geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/navigation_msgs-release/archive/release/eloquent/move_base_msgs/2.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/move_base_msgs"
SRC_URI = "git://github.com/ros2-gbp/navigation_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "4e14bad4c549745034340f5d7d58abe7455f966a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
