package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                lineTo(7.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,14.0f)
                lineTo(7.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,10.0f)
                lineTo(17.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,14.0f)
                lineTo(17.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.205f,4.139f)
                curveTo(15.2448635f,3.1232414f,16.753933f,2.751574f,18.146585f,3.168231f)
                curveTo(19.539236f,3.5848877f,20.596226f,4.7242746f,20.907366f,6.1442294f)
                curveTo(21.218506f,7.5641847f,20.734816f,9.041165f,19.644001f,10.002f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.637f,14.0f)
                curveTo(20.736956f,14.95741f,21.22873f,16.437557f,20.920418f,17.862858f)
                curveTo(20.612106f,19.288158f,19.55257f,20.432737f,18.155264f,20.849957f)
                curveTo(16.757957f,21.267176f,15.244318f,20.890915f,14.204999f,19.868f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.367f,10.0f)
                curveTo(3.2658927f,9.042034f,2.7739503f,7.5603857f,3.0834212f,6.134074f)
                curveTo(3.3928924f,4.707763f,4.454646f,3.5632246f,5.8537555f,3.147738f)
                curveTo(7.252865f,2.7322514f,8.767213f,3.1117775f,9.805f,4.138f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.795f,19.862f)
                curveTo(8.752437f,20.871174f,7.245119f,21.236628f,5.856135f,20.81699f)
                curveTo(4.467151f,20.39735f,3.414334f,19.25843f,3.104953f,17.840807f)
                curveTo(2.795572f,16.423183f,3.278147f,14.949182f,4.366f,13.988999f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,8.0f)
                lineTo(13.0f,8.0f)
                lineTo(14.0f,8.0f)
                lineTo(14.0f,16.0f)
                lineTo(13.0f,16.0f)
                lineTo(11.0f,16.0f)
                lineTo(10.0f,16.0f)
                lineTo(10.0f,8.0f)
                lineTo(11.0f,8.0f)
                close()
            }
}

public val LucideIcons.All.DroneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drone: ImageVector
    @Composable get() = DroneDefinition.asImageVector()
