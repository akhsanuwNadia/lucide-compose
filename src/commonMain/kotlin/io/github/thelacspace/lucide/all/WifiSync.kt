package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.96500015258789,10.104999542236328)
                lineTo(11.96500015258789,14.104999542236328)
                lineTo(13.5,12.5)
                curveTo(14.664688110351562,11.380638122558594,16.29841423034668,10.892928123474121,17.886133193969727,11.190625190734863)
                curveTo(19.47385025024414,11.488322257995605,20.819927215576172,12.534745216369629,21.5,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.96500015258789,14.104999542236328)
                lineTo(15.96500015258789,14.104999542236328)
            }
            lucidePath(strokeWidth) {
                moveTo(17.96500015258789,18.104999542236328)
                lineTo(21.96500015258789,18.104999542236328)
                lineTo(20.43000030517578,19.709999084472656)
                curveTo(19.26531219482422,20.829360961914062,17.6315860748291,21.31707191467285,16.043867111206055,21.01937484741211)
                curveTo(14.45615005493164,20.721677780151367,13.11007308959961,19.675254821777344,12.430000305175781,18.209999084472656)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.819999694824219)
                curveTo(7.6940131187438965,3.7271194458007812,16.305986404418945,3.7271194458007812,22.0,8.819999694824219)
            }
            lucidePath(strokeWidth) {
                moveTo(21.96500015258789,22.104999542236328)
                lineTo(21.96500015258789,18.104999542236328)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,12.859999656677246)
                curveTo(5.867920398712158,12.005635261535645,6.884606838226318,11.317000389099121,8.0,10.827999114990234)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,16.429000854492188)
                lineTo(8.510000228881836,16.429000854492188)
            }
}

public val LucideIcons.All.WifiSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiSync: ImageVector
    @Composable get() = WifiSyncDefinition.asImageVector()
