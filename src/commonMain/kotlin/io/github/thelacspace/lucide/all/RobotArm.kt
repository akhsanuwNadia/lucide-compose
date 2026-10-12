package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RobotArm") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                lineTo(7.5f, 8.322f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 7f)
                lineToRelative(1.75f, -3.767f)
                arcToRelative(.5f, .5f, 0f, false, true, .662f, -.172f)
                lineTo(20f, 5.005f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 8.998f)
                lineToRelative(-3.588f, 1.944f)
                arcToRelative(.5f, .5f, 0f, false, true, -.662f, -.172f)
                lineTo(14f, 7f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.486f, 21f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                verticalLineTo(8.732f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.RobotArmDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RobotArm: ImageVector
    @Composable get() = RobotArmDefinition.asImageVector()
