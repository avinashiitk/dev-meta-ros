# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The formatters here simply format various input types to a specified    text format. They can be used with most streaming types (including both    ecl and stl streams)."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_formatters"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ecl_core"
ROS_BPN = "ecl_formatters"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-config \
    ecl-converters \
    ecl-exceptions \
    ecl-license \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-config \
    ecl-converters \
    ecl-exceptions \
    ecl-license \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_formatters/1.0.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "200a64e13a61b3dd3d268038c2bfabc2"
SRC_URI[sha256sum] = "c40a4dcec7b8e9aa79d729f2cc9d186e5a3b295c4b17b21d13f5be15951ee075"
S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_formatters-1.0.4-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ecl-core', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ecl-core', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-core/ecl-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-core/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
