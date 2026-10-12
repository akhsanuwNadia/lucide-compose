package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bird") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,7.0f)
                lineTo(16.01f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.4f,18.0f)
                lineTo(12.0f,18.0f)
                curveTo(16.418278f,18.0f,20.0f,14.418278f,20.0f,10.0f)
                lineTo(20.0f,7.0f)
                curveTo(20.00462f,5.2511806f,18.872622f,3.7021062f,17.20504f,3.1752605f)
                curveTo(15.53746f,2.648415f,13.720954f,3.2659564f,12.719999f,4.7f)
                lineTo(2.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,7.0f)
                lineTo(22.0f,7.5f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,18.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,17.75f)
                lineTo(14.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,18.0f)
                curveTo(9.526259f,17.999874f,11.781824f,16.417383f,12.64156f,14.041917f)
                curveTo(13.501295f,11.6664505f,12.781009f,9.006932f,10.84f,7.3900003f)
            }
}

public val LucideIcons.All.BirdDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bird: ImageVector
    @Composable get() = BirdDefinition.asImageVector()
