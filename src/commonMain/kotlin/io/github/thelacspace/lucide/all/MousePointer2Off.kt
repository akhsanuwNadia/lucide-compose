package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointer2Off") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.550000190734863,8.449999809265137)
                lineTo(20.687999725341797,10.536999702453613)
                curveTo(20.887529373168945,10.618290901184082,21.012548446655273,10.818255424499512,20.998245239257812,11.033234596252441)
                curveTo(20.983943939208984,11.248212814331055,20.833539962768555,11.429855346679688,20.625,11.483999252319336)
                lineTo(14.500999450683594,13.06399917602539)
                curveTo(13.7963285446167,13.245157241821289,13.245628356933594,13.794708251953125,13.062999725341797,14.498998641967773)
                lineTo(11.483999252319336,20.624998092651367)
                curveTo(11.429855346679688,20.833538055419922,11.248213768005371,20.983943939208984,11.033233642578125,20.998245239257812)
                curveTo(10.818254470825195,21.01254653930664,10.618289947509766,20.887529373168945,10.536998748779297,20.687997817993164)
                lineTo(8.449999809265137,15.550999641418457)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,2.0)
                lineTo(2.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.815999984741211,11.527999877929688)
                lineTo(4.036999702453613,4.687999725341797)
                curveTo(3.956238269805908,4.50161600112915,3.997542381286621,4.2848100662231445,4.141176223754883,4.141176223754883)
                curveTo(4.2848100662231445,3.997542381286621,4.50161600112915,3.956238269805908,4.687999725341797,4.036999702453613)
                lineTo(11.527999877929688,6.815999984741211)
            }
}

public val LucideIcons.All.MousePointer2OffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointer2Off: ImageVector
    @Composable get() = MousePointer2OffDefinition.asImageVector()
