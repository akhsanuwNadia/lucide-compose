package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,18.0f)
                lineTo(15.465f,19.605f)
                curveTo(14.300312f,20.724361f,12.666585f,21.212072f,11.078867f,20.914375f)
                curveTo(9.49115f,20.616678f,8.145073f,19.570255f,7.465f,18.105f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,22.0f)
                lineTo(17.0f,18.0f)
                lineTo(13.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.996f,15.251f)
                curveTo(22.038673f,13.901568f,22.228975f,12.078688f,21.487497f,10.542996f)
                curveTo(20.746021f,9.007306f,19.200174f,8.022689f,17.495f,8.0f)
                lineTo(15.705001f,8.0f)
                curveTo(14.928483f,5.403283f,12.722732f,3.488187f,10.042726f,3.083851f)
                curveTo(7.36272f,2.6795151f,4.690144f,3.8586113f,3.1820874f,6.110651f)
                curveTo(1.6740309f,8.362691f,1.6015406f,11.282909f,2.9960012f,13.607f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                lineTo(7.0f,14.0f)
                lineTo(11.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,14.0f)
                lineTo(8.535f,12.395f)
                curveTo(9.699688f,11.275639f,11.333415f,10.787929f,12.921133f,11.085626f)
                curveTo(14.50885f,11.383323f,15.854927f,12.429746f,16.535f,13.895f)
            }
}

public val LucideIcons.All.CloudSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudSync: ImageVector
    @Composable get() = CloudSyncDefinition.asImageVector()
