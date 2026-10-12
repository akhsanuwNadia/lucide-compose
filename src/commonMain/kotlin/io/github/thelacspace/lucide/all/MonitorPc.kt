package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorPc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 15f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, false, -2f, Vf)
                arcToRelative(7f, af, 2f, false, false, 012f, -2f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 19f)
                horizontalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 11f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 7f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 17f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 19f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.MonitorPcDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorPc: ImageVector
    @Composable get() = MonitorPcDefinition.asImageVector()
