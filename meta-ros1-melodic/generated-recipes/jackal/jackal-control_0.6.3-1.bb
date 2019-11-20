# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Controllers for Jackal"
AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
ROS_AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
HOMEPAGE = "http://wiki.ros.org/jackal_control"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jackal"
ROS_BPN = "jackal_control"

ROS_BUILD_DEPENDS = " \
    roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager \
    diff-drive-controller \
    interactive-marker-twist-server \
    joint-state-controller \
    joy \
    robot-localization \
    teleop-twist-joy \
    topic-tools \
    twist-mux \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    diff-drive-controller \
    interactive-marker-twist-server \
    joint-state-controller \
    joy \
    robot-localization \
    teleop-twist-joy \
    topic-tools \
    twist-mux \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/jackal-release/archive/release/melodic/jackal_control/0.6.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jackal_control"
SRC_URI = "git://github.com/clearpath-gbp/jackal-release;${ROS_BRANCH};protocol=https"
SRCREV = "2d8fc2f8f0f63487221010b2c36645f8592491ea"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('jackal', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
