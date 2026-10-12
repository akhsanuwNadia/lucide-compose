package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EyeClosed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                lineTo(14.278f,14.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,8.0f)
                curveTo(3.5329707f,12.200939f,7.5281f,14.995886f,12.0f,14.995886f)
                curveTo(16.4719f,14.995886f,20.46703f,12.200939f,22.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,15.0f)
                lineTo(18.274f,12.95f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,15.0f)
                lineTo(5.726f,12.95f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,18.0f)
                lineTo(9.722f,14.75f)
            }
}

public val LucideIcons.All.EyeClosedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EyeClosed: ImageVector
    @Composable get() = EyeClosedDefinition.asImageVector()
