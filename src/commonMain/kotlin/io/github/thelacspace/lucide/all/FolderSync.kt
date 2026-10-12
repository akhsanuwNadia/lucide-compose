package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,20.0f)
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
                lineTo(22.0f,8.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,10.0f)
                lineTo(12.0f,14.0f)
                lineTo(16.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(13.535f,12.395f)
                curveTo(14.699688f,11.275639f,16.333414f,10.787929f,17.921133f,11.085626f)
                curveTo(19.50885f,11.383323f,20.854927f,12.429746f,21.535f,13.895f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(22.0f,18.0f)
                lineTo(18.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,18.0f)
                lineTo(20.465f,19.605f)
                curveTo(19.300312f,20.724361f,17.666586f,21.212072f,16.078867f,20.914375f)
                curveTo(14.49115f,20.616678f,13.145073f,19.570255f,12.465f,18.105f)
            }
}

public val LucideIcons.All.FolderSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderSync: ImageVector
    @Composable get() = FolderSyncDefinition.asImageVector()
