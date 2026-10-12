package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bomb") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,13.0)
                curveTo(1.9855774641036987,16.224979400634766,3.6978065967559814,19.211172103881836,6.488340854644775,20.827838897705078)
                curveTo(9.278875350952148,22.44450569152832,12.721124649047852,22.44450569152832,15.511658668518066,20.827838897705078)
                curveTo(18.30219268798828,19.211172103881836,20.014423370361328,16.224979400634766,20.0,13.0)
                curveTo(20.014423370361328,9.77502155303955,18.30219268798828,6.788827896118164,15.511658668518066,5.172161102294922)
                curveTo(12.721124649047852,3.5554938316345215,9.278875350952148,3.5554938316345215,6.488340854644775,5.172161102294922)
                curveTo(3.6978065967559814,6.788827896118164,1.9855774641036987,9.77502155303955,2.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.350000381469727,4.650000095367432)
                lineTo(16.299999237060547,2.700000047683716)
                curveTo(17.240211486816406,1.764326572418213,18.75978660583496,1.764326572418213,19.69999885559082,2.700000047683716)
                lineTo(21.299999237060547,4.300000190734863)
                curveTo(21.751890182495117,4.750324726104736,22.005891799926758,5.36203670501709,22.005891799926758,6.0)
                curveTo(22.005891799926758,6.637963771820068,21.751890182495117,7.249675750732422,21.299999237060547,7.700000286102295)
                lineTo(19.349998474121094,9.65000057220459)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,2.0)
                lineTo(20.5,3.5)
            }
}

public val LucideIcons.All.BombDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bomb: ImageVector
    @Composable get() = BombDefinition.asImageVector()
