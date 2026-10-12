package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.965f,10.105f)
                lineTo(11.965f,14.105f)
                lineTo(13.5f,12.5f)
                curveTo(14.664688f,11.380638f,16.298414f,10.892928f,17.886133f,11.190625f)
                curveTo(19.47385f,11.488322f,20.819927f,12.534745f,21.5f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.965f,14.105f)
                lineTo(15.965f,14.105f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.965f,18.105f)
                lineTo(21.965f,18.105f)
                lineTo(20.43f,19.71f)
                curveTo(19.265312f,20.829361f,17.631586f,21.317072f,16.043867f,21.019375f)
                curveTo(14.45615f,20.721678f,13.110073f,19.675255f,12.43f,18.21f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,8.82f)
                curveTo(7.694013f,3.7271194f,16.305986f,3.7271194f,22.0f,8.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.965f,22.105f)
                lineTo(21.965f,18.105f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,12.86f)
                curveTo(5.8679204f,12.005635f,6.884607f,11.317f,8.0f,10.827999f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,16.429f)
                lineTo(8.51f,16.429f)
            }
}

public val LucideIcons.All.WifiSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiSync: ImageVector
    @Composable get() = WifiSyncDefinition.asImageVector()
