package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PencilOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(3.8429999351501465,16.16200065612793)
                curveTo(3.610400438308716,16.394350051879883,3.438667058944702,16.680458068847656,3.3429999351501465,16.9950008392334)
                lineTo(2.0209999084472656,21.35500144958496)
                curveTo(1.967579960823059,21.531246185302734,2.0153684616088867,21.72258949279785,2.1453821659088135,21.8530216217041)
                curveTo(2.2753958702087402,21.98345375061035,2.4665842056274414,22.031856536865234,2.6429998874664307,21.979001998901367)
                lineTo(7.000999450683594,20.656002044677734)
                curveTo(7.314467906951904,20.55988883972168,7.599499225616455,20.38818359375,7.830999374389648,20.156002044677734)
                lineTo(14.0,13.982000350952148)
            }
            lucidePath(strokeWidth) {
                moveTo(12.829000473022461,7.171999931335449)
                lineTo(17.187999725341797,2.8259997367858887)
                curveTo(17.89896011352539,2.108652353286743,18.93939971923828,1.8265399932861328,19.91534996032715,2.086486339569092)
                curveTo(20.891300201416016,2.34643292427063,21.653566360473633,3.1086997985839844,21.91351318359375,4.084650039672852)
                curveTo(22.173460006713867,5.060600280761719,21.891347885131836,6.101039886474609,21.173999786376953,6.811999797821045)
                lineTo(16.820999145507812,11.164999961853027)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,5.0)
                lineTo(19.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.PencilOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PencilOff: ImageVector
    @Composable get() = PencilOffDefinition.asImageVector()
