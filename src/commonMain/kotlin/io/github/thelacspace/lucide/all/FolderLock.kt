package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,17.0f)
                lineTo(21.0f,17.0f)
                lineTo(22.0f,17.0f)
                lineTo(22.0f,22.0f)
                lineTo(21.0f,22.0f)
                lineTo(15.0f,22.0f)
                lineTo(14.0f,22.0f)
                lineTo(14.0f,17.0f)
                lineTo(15.0f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(7.9f,3.0f)
                curveTo(8.579667f,2.9933364f,9.216198f,3.332317f,9.59f,3.9f)
                lineTo(10.400001f,5.1000004f)
                curveTo(10.769923f,5.6617208f,11.397414f,5.99989f,12.070001f,6.0000005f)
                lineTo(20.0f,6.0000005f)
                curveTo(21.104568f,6.0000005f,22.0f,6.8954306f,22.0f,8.0f)
                lineTo(22.0f,10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,17.0f)
                lineTo(20.0f,15.0f)
                curveTo(20.003204f,14.283339f,19.62271f,13.61974f,19.00259f,13.26048f)
                curveTo(18.382473f,12.901221f,17.617527f,12.901221f,16.99741f,13.26048f)
                curveTo(16.37729f,13.61974f,15.996795f,14.283339f,16.0f,15.0f)
                lineTo(16.0f,17.0f)
            }
}

public val LucideIcons.All.FolderLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderLock: ImageVector
    @Composable get() = FolderLockDefinition.asImageVector()
