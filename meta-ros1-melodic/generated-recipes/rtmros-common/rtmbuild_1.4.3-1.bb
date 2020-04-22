# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Build scripts for OpenRTM and OpenHRP"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/rtmbuild"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtmros_common"
ROS_BPN = "rtmbuild"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_omniorb} \
    cmake-modules \
    message-generation \
    openrtm-aist \
    openrtm-aist-python \
    pkgconfig \
    rostest \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_omniorb} \
    cmake-modules \
    lapack \
    message-generation \
    message-runtime \
    openblas \
    openrtm-aist \
    openrtm-aist-python \
    pkgconfig \
    rostest \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_omniorb} \
    cmake-modules \
    lapack \
    message-generation \
    message-runtime \
    openblas \
    openrtm-aist \
    openrtm-aist-python \
    pkgconfig \
    rostest \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/rtmros_common-release/archive/release/melodic/rtmbuild/1.4.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rtmbuild"
SRC_URI = "git://github.com/tork-a/rtmros_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "a00d016e749222bc368330b98b713bb5f0f5f8ef"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
