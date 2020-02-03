# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Graphical frontend for interacting with joint_trajectory_controller instances."
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Adolfo Rodriguez Tsouroukdissian <adolfo.rodriguez@pal-robotics.com>"
HOMEPAGE = "http://wiki.ros.org/rqt_joint_trajectory_controller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_controllers"
ROS_BPN = "rqt_joint_trajectory_controller"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    control-msgs \
    controller-manager-msgs \
    rospy \
    rqt-gui \
    rqt-gui-py \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/rqt_joint_trajectory_controller/0.15.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rqt_joint_trajectory_controller"
SRC_URI = "git://github.com/ros-gbp/ros_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "11349e7342c0a469819c73ecf0380908232fce6c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
