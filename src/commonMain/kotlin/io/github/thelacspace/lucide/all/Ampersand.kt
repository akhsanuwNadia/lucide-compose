package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ampersand") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(19.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f,12.0f)
                curveTo(17.5f,16.418278f,13.918278f,20.0f,9.5f,20.0f)
                curveTo(7.0147185f,20.0f,5.0f,17.985281f,5.0f,15.5f)
                curveTo(5.0f,9.5f,13.0f,11.5f,13.0f,7.0f)
                curveTo(13.004807f,5.9250073f,12.434065f,4.9296093f,11.503886f,4.3907204f)
                curveTo(10.573709f,3.8518312f,9.426291f,3.8518312f,8.496114f,4.3907204f)
                curveTo(7.5659356f,4.9296093f,6.9951925f,5.9250073f,7.0f,7.0f)
                curveTo(7.0f,10.0f,9.5f,15.5f,19.0f,20.0f)
            }
}

public val LucideIcons.All.AmpersandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ampersand: ImageVector
    @Composable get() = AmpersandDefinition.asImageVector()
