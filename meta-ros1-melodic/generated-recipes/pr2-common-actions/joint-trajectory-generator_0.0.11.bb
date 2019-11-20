# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "joint_trajectory_generator action takes in a trajectory specified     by a number of joint positions, and it generates a new smooth trajectory     through these joint positions."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://ros.org/wiki/joint_trajectory_generator"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_common_actions"
ROS_BPN = "joint_trajectory_generator"

ROS_BUILD_DEPENDS = " \
    actionlib \
    angles \
    joint-trajectory-action \
    orocos-kdl \
    pr2-controllers-msgs \
    roscpp \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    angles \
    joint-trajectory-action \
    orocos-kdl \
    pr2-controllers-msgs \
    roscpp \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    angles \
    joint-trajectory-action \
    orocos-kdl \
    pr2-controllers-msgs \
    roscpp \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/joint_trajectory_generator/0.0.11-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/joint_trajectory_generator"
SRC_URI = "git://github.com/pr2-gbp/pr2_common_actions-release;${ROS_BRANCH};protocol=https"
SRCREV = "3cf36636e15ec4df150fe462bf1813fb542ee585"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-common-actions', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
