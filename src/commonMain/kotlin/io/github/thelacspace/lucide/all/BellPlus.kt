package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.267999649047852,21.0)
                curveTo(10.62527847290039,21.618751525878906,11.285504341125488,21.99991226196289,12.0,21.99991226196289)
                curveTo(12.714494705200195,21.99991226196289,13.374720573425293,21.618751525878906,13.731999397277832,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,8.0)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,5.0)
                lineTo(18.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.00200080871582,14.46399974822998)
                curveTo(20.229591369628906,14.766914367675781,20.47608184814453,15.055153846740723,20.740001678466797,15.32699966430664)
                curveTo(21.006484985351562,15.61987018585205,21.075063705444336,16.042394638061523,20.91489028930664,16.404516220092773)
                curveTo(20.754716873168945,16.76663589477539,20.395963668823242,17.00014305114746,20.0,17.0)
                lineTo(4.0,17.0)
                curveTo(3.604037284851074,17.000141143798828,3.245283365249634,16.76663589477539,3.085110664367676,16.40451431274414)
                curveTo(2.9249379634857178,16.042394638061523,2.9935169219970703,15.61987018585205,3.259999990463257,15.32699966430664)
                curveTo(4.590000152587891,13.956000328063965,6.0,12.49899959564209,6.0,8.0)
                curveTo(6.000237941741943,5.907336235046387,7.090778827667236,3.965984582901001,8.877792358398438,2.8770294189453125)
                curveTo(10.664806365966797,1.7880744934082031,12.890081405639648,1.7088626623153687,14.75,2.6680002212524414)
            }
}

public val LucideIcons.All.BellPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellPlus: ImageVector
    @Composable get() = BellPlusDefinition.asImageVector()
