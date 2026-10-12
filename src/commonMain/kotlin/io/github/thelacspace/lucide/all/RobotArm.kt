package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RobotArm") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,21.0f)
                lineTo(7.5f,8.322f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,7.0f)
                lineTo(15.75f,3.233f)
                curveTo(15.890805f,3.0100958f,16.180498f,2.9348283f,16.412f,3.061f)
                lineTo(20.0f,5.005f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,8.998f)
                lineTo(16.412f,10.942f)
                curveTo(16.180498f,11.0681715f,15.890806f,10.992904f,15.750001f,10.77f)
                lineTo(14.0f,7.0f)
                lineTo(8.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.486f,21.0f)
                lineTo(13.486f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                lineTo(5.0f,8.732f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,7.0f)
                curveTo(3.996795f,7.716662f,4.3772902f,8.38026f,4.9974093f,8.73952f)
                curveTo(5.617528f,9.098779f,6.382472f,9.098779f,7.0025907f,8.73952f)
                curveTo(7.6227098f,8.38026f,8.003205f,7.716662f,8.0f,7.0f)
                curveTo(8.003205f,6.283338f,7.6227098f,5.6197395f,7.0025907f,5.2604804f)
                curveTo(6.382472f,4.901221f,5.617528f,4.901221f,4.9974093f,5.2604804f)
                curveTo(4.3772902f,5.6197395f,3.996795f,6.283338f,4.0f,7.0f)
            }
}

public val LucideIcons.All.RobotArmDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RobotArm: ImageVector
    @Composable get() = RobotArmDefinition.asImageVector()
