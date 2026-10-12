package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.267999649047852,21.0)
                curveTo(10.62527847290039,21.618751525878906,11.285504341125488,21.99991226196289,12.0,21.99991226196289)
                curveTo(12.714494705200195,21.99991226196289,13.374720573425293,21.618751525878906,13.731999397277832,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,17.0)
                lineTo(4.0,17.0)
                curveTo(3.604037284851074,17.000141143798828,3.245283365249634,16.76663589477539,3.085110664367676,16.40451431274414)
                curveTo(2.9249379634857178,16.042394638061523,2.9935169219970703,15.61987018585205,3.259999990463257,15.32699966430664)
                curveTo(4.590000152587891,13.956000328063965,6.0,12.49899959564209,6.0,8.0)
                curveTo(5.999855041503906,7.409804344177246,6.086791038513184,6.822816848754883,6.257999897003174,6.257999897003174)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.668000221252441,3.009999990463257)
                curveTo(10.508919715881348,1.7806957960128784,12.877155303955078,1.6648820638656616,14.82923698425293,2.708697557449341)
                curveTo(16.78131866455078,3.7525129318237305,18.000085830688477,5.786366939544678,18.0,8.0)
                curveTo(18.0,10.687000274658203,18.770000457763672,12.652999877929688,19.707000732421875,14.050000190734863)
            }
}

public val LucideIcons.All.BellOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellOff: ImageVector
    @Composable get() = BellOffDefinition.asImageVector()
