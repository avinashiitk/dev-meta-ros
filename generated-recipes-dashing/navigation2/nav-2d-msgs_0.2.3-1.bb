# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Basic message types for two dimensional navigation, extending from geometry_msgs::Pose2D."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation2"
ROS_BPN = "nav_2d_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    rosidl-default-generators \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    rosidl-default-generators \
    rosidl-default-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rosidl-default-generators \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav_2d_msgs/0.2.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3184a563b9889d547d3e3479c5c32caa"
SRC_URI[sha256sum] = "d80b02bc9e19dab9b6b8f66995458b047d3df7cc0b9914afef604e04fa00bfd5"
S = "${WORKDIR}/navigation2-release-release-dashing-nav_2d_msgs-0.2.3-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('navigation2', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('navigation2', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/navigation2_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/navigation2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
