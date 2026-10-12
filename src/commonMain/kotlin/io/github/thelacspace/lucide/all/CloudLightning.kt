package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudLightning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,16.326000213623047)
                curveTo(3.097280740737915,14.947660446166992,1.5057965517044067,11.770052909851074,2.1405069828033447,8.620014190673828)
                curveTo(2.7752175331115723,5.46997594833374,5.473087787628174,3.156642436981201,8.683085441589355,3.009971857070923)
                curveTo(11.893083572387695,2.8633015155792236,14.790672302246094,4.920968532562256,15.710000038146973,8.0)
                lineTo(17.5,8.0)
                curveTo(19.89103889465332,7.995830059051514,21.867849349975586,9.862289428710938,22.000877380371094,12.249629020690918)
                curveTo(22.133907318115234,14.636968612670898,20.376699447631836,16.711498260498047,18.0,16.972999572753906)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,12.0)
                lineTo(10.0,17.0)
                lineTo(14.0,17.0)
                lineTo(11.0,22.0)
            }
}

public val LucideIcons.All.CloudLightningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudLightning: ImageVector
    @Composable get() = CloudLightningDefinition.asImageVector()
