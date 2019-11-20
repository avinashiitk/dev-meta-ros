# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Tools for directing, throttling, selecting, and otherwise messing with     ROS topics at a meta level. None of the programs in this package actually     know about the topics whose streams they are altering; instead, these     tools deal with messages as generic binary blobs. This means they can be     applied to any ROS topic."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Morgan Quigley"
HOMEPAGE = "http://ros.org/wiki/topic_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_comm"
ROS_BPN = "topic_tools"

ROS_BUILD_DEPENDS = " \
    cpp-common \
    message-generation \
    rosconsole \
    roscpp \
    rostest \
    rostime \
    rosunit \
    std-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    rosconsole \
    roscpp \
    rostime \
    std-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    rosconsole \
    roscpp \
    rostime \
    std-msgs \
    xmlrpcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/topic_tools/1.14.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/topic_tools"
SRC_URI = "git://github.com/ros-gbp/ros_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "5322b359e2958528daa8a19d385060a29cbe3368"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-comm', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
