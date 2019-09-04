# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "dummy map server node"
AUTHOR = "Karsten Knese <karsten@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "demos"
ROS_BPN = "dummy_map_server"

ROS_BUILD_DEPENDS = " \
    nav-msgs \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nav-msgs \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/dummy_map_server/0.7.8-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "30a4d1a97bc4c9c925be9ba3d982590f"
SRC_URI[sha256sum] = "82d89d816738d92a58c6e6358cca48e4f784b8097753d8b6fc7f3a10a4b0bad7"
S = "${WORKDIR}/demos-release-release-dashing-dummy_map_server-0.7.8-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('demos', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('demos', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/demos/demos_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/demos/demos-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/demos/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/demos/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
