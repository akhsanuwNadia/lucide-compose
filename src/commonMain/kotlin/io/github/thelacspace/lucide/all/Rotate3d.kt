package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rotate3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.194000244140625,13.706999778747559)
                lineTo(19.007999420166016,15.566999435424805)
                lineTo(17.147998809814453,19.380998611450195)
            }
            lucidePath(strokeWidth) {
                moveTo(16.472139358520508,7.527860164642334)
                curveTo(15.3128662109375,2.8907740116119385,12.573891639709473,0.7946064472198486,10.16297721862793,2.699390172958374)
                curveTo(7.752063751220703,4.6041741371154785,6.4688191413879395,9.878166198730469,7.207054615020752,14.847899436950684)
                curveTo(7.9452900886535645,19.8176326751709,10.460162162780762,22.834840774536133,13.0,21.79796028137207)
            }
            lucidePath(strokeWidth) {
                moveTo(21.79796028137207,11.0)
                curveTo(20.88336753845215,8.759703636169434,17.04589080810547,7.115040302276611,12.47813606262207,7.0057148933410645)
                curveTo(7.910380840301514,6.896389007568359,3.776261568069458,8.350258827209473,2.437873125076294,10.536632537841797)
                curveTo(1.0994848012924194,12.723005294799805,2.8978633880615234,15.084769248962402,6.805477142333984,16.272493362426758)
                curveTo(10.713090896606445,17.460216522216797,15.734234809875488,17.171255111694336,19.0,15.570710182189941)
            }
}

public val LucideIcons.All.Rotate3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rotate3d: ImageVector
    @Composable get() = Rotate3dDefinition.asImageVector()
