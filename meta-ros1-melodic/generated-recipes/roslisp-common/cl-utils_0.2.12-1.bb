# Generated by superflore -- DO NOT EDIT

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Common Lisp utility libraries"
AUTHOR = "Gayane Kazhoyan <kazhoyan@cs.uni-bremen.de>"
ROS_AUTHOR = "Bhaskara Marthi"
HOMEPAGE = "http://wiki.ros.org/cl_utils"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "roslisp_common"
ROS_BPN = "cl_utils"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_sbcl} \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_sbcl} \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_utils/0.2.12-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cl_utils"
SRC_URI = "git://github.com/ros-gbp/roslisp_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "04d5e54ea7e4aed277c0ac558a963eea9c1a725d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
