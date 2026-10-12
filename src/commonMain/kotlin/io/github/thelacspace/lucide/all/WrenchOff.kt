package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WrenchOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.746999740600586,5.0929999351501465)
                curveTo(12.088079452514648,2.6677029132843018,14.915732383728027,1.4764593839645386,17.58799934387207,2.2109999656677246)
                curveTo(18.025999069213867,2.3309998512268066,18.128000259399414,2.872999906539917,17.80699920654297,3.194999933242798)
                lineTo(14.699999809265137,6.300000190734863)
                curveTo(14.318857192993164,6.688843727111816,14.318857192993164,7.311156749725342,14.699999809265137,7.700000286102295)
                lineTo(16.299999237060547,9.300000190734863)
                curveTo(16.6888427734375,9.681142807006836,17.311155319213867,9.681142807006836,17.69999885559082,9.300000190734863)
                lineTo(20.805999755859375,6.195000171661377)
                curveTo(21.125999450683594,5.873000144958496,21.66900062561035,5.975000381469727,21.788999557495117,6.413000106811523)
                curveTo(22.524057388305664,9.085578918457031,21.332740783691406,11.913818359375,18.906999588012695,13.255000114440918)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5,13.5)
                lineTo(5.619999885559082,21.380001068115234)
                curveTo(4.790499210357666,22.201841354370117,3.4527347087860107,22.198627471923828,2.627192974090576,21.37281036376953)
                curveTo(1.8016514778137207,20.546993255615234,1.798883080482483,19.209228515625,2.620999813079834,18.380001068115234)
                lineTo(10.500999450683594,10.500000953674316)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.WrenchOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WrenchOff: ImageVector
    @Composable get() = WrenchOffDefinition.asImageVector()
