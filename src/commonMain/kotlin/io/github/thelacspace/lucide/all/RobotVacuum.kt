package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RobotVacuum") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 17f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 2f)
                verticalLineToRelative(2.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 5f)
                horizontalLineToRelative(2.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 5f)
                horizontalLineToRelative(-2.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 2f)
                verticalLineToRelative(2.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
}

public val LucideIcons.All.RobotVacuumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RobotVacuum: ImageVector
    @Composable get() = RobotVacuumDefinition.asImageVector()
