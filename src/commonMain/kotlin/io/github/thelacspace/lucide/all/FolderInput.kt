package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderInput") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(7.9f,3.0f)
                curveTo(8.579667f,2.9933364f,9.216198f,3.332317f,9.59f,3.9f)
                lineTo(10.400001f,5.1000004f)
                curveTo(10.769923f,5.6617208f,11.397414f,5.99989f,12.070001f,6.0000005f)
                lineTo(20.0f,6.0000005f)
                curveTo(21.104568f,6.0000005f,22.0f,6.8954306f,22.0f,8.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,19.10457f,21.10457f,20.0f,20.0f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                lineTo(12.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,16.0f)
                lineTo(12.0f,13.0f)
                lineTo(9.0f,10.0f)
            }
}

public val LucideIcons.All.FolderInputDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderInput: ImageVector
    @Composable get() = FolderInputDefinition.asImageVector()
