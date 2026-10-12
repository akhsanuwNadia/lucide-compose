package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.267999649047852,21.0)
                curveTo(10.62527847290039,21.618751525878906,11.285504341125488,21.99991226196289,12.0,21.99991226196289)
                curveTo(12.714494705200195,21.99991226196289,13.374720573425293,21.618751525878906,13.731999397277832,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,8.0)
                lineTo(17.0,10.0)
                lineTo(21.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.860700607299805,4.482399940490723)
                curveTo(15.335565567016602,2.3749403953552246,12.626106262207031,1.4903713464736938,10.151249885559082,2.291936159133911)
                curveTo(7.676393032073975,3.093501091003418,6.000004768371582,5.39857292175293,6.0,8.0)
                curveTo(6.0,12.49899959564209,4.589000225067139,13.956000328063965,3.26200008392334,15.326000213623047)
            }
            lucidePath(strokeWidth) {
                moveTo(3.26200008392334,15.326000213623047)
                curveTo(2.995089054107666,15.618545532226562,2.925956964492798,16.041038513183594,3.0857067108154297,16.403398513793945)
                curveTo(3.2454564571380615,16.765756607055664,3.603989601135254,16.999710083007812,4.0,17.0)
                lineTo(20.0,17.0)
                curveTo(20.39596176147461,17.000141143798828,20.754716873168945,16.76663589477539,20.914888381958008,16.40451431274414)
                curveTo(21.075061798095703,16.042394638061523,21.00648307800293,15.61987018585205,20.739999771118164,15.32699966430664)
                curveTo(20.208999633789062,14.779000282287598,19.665000915527344,14.218000411987305,19.202999114990234,13.454000473022461)
            }
}

public val LucideIcons.All.BellCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellCheck: ImageVector
    @Composable get() = BellCheckDefinition.asImageVector()
