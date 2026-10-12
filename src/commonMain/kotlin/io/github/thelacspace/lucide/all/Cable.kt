package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cable") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,19.0)
                curveTo(16.447715759277344,19.0,16.0,18.552284240722656,16.0,18.0)
                lineTo(16.0,16.0)
                curveTo(16.0,14.895430564880371,16.895429611206055,14.0,18.0,14.0)
                lineTo(20.0,14.0)
                curveTo(21.104570388793945,14.0,22.0,14.895430564880371,22.0,16.0)
                lineTo(22.0,18.0)
                curveTo(22.0,18.552284240722656,21.552284240722656,19.0,21.0,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,21.0)
                lineTo(17.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,14.0)
                lineTo(19.0,6.5)
                curveTo(18.991382598876953,4.573112964630127,17.42690658569336,3.015617609024048,15.5,3.015617609024048)
                curveTo(13.573094367980957,3.015617609024048,12.008617401123047,4.573112964630127,12.0,6.5)
                lineTo(12.0,17.5)
                curveTo(11.991382598876953,19.42688751220703,10.426905632019043,20.98438262939453,8.5,20.98438262939453)
                curveTo(6.573093891143799,20.98438262939453,5.008617401123047,19.42688751220703,5.0,17.5)
                lineTo(5.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                lineTo(21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                curveTo(2.895430564880371,10.0,2.0,9.104569435119629,2.0,8.0)
                lineTo(2.0,6.0)
                curveTo(2.0,5.4477152824401855,2.4477152824401855,5.0,3.0,5.0)
                lineTo(7.0,5.0)
                curveTo(7.5522847175598145,5.0,8.0,5.4477152824401855,8.0,6.0)
                lineTo(8.0,8.0)
                curveTo(8.0,9.104569435119629,7.104569435119629,10.0,6.0,10.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,5.0)
                lineTo(7.0,3.0)
            }
}

public val LucideIcons.All.CableDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cable: ImageVector
    @Composable get() = CableDefinition.asImageVector()
