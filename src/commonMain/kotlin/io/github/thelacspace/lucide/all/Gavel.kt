package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gavel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,13.0f)
                lineTo(5.6190004f,21.380001f)
                curveTo(4.7894974f,22.202393f,3.4512858f,22.199623f,2.6251936f,21.373806f)
                curveTo(1.7991016f,20.547989f,1.7958863f,19.209778f,2.6180005f,18.380001f)
                lineTo(11.002001f,9.9990015f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(22.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f,10.5f)
                lineTo(13.5f,2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(14.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,7.5f)
                lineTo(16.5f,15.5f)
            }
}

public val LucideIcons.All.GavelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gavel: ImageVector
    @Composable get() = GavelDefinition.asImageVector()
