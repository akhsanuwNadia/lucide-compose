package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Fan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.82699966430664,16.378999710083008)
                curveTo(8.686441421508789,17.460718154907227,6.11005163192749,17.183473587036133,4.2486419677734375,15.67110538482666)
                curveTo(2.3872323036193848,14.158737182617188,1.588413953781128,11.693674087524414,2.2089996337890625,9.376999855041504)
                lineTo(7.620999813079834,10.82699966430664)
                curveTo(6.539281845092773,8.686441421508789,6.816525936126709,6.110052108764648,8.32889461517334,4.248642444610596)
                curveTo(9.841262817382812,2.387232780456543,12.30632495880127,1.588414192199707,14.62299919128418,2.2089996337890625)
                lineTo(13.172999382019043,7.620999813079834)
                curveTo(15.313557624816895,6.539281368255615,17.88994789123535,6.816524982452393,19.751358032226562,8.328893661499023)
                curveTo(21.612768173217773,9.841261863708496,22.41158676147461,12.30632495880127,21.791000366210938,14.62299919128418)
                lineTo(16.378999710083008,13.172999382019043)
                curveTo(17.460718154907227,15.313557624816895,17.183473587036133,17.88994789123535,15.671106338500977,19.751358032226562)
                curveTo(14.158737182617188,21.612768173217773,11.693674087524414,22.41158676147461,9.376999855041504,21.791000366210938)
                lineTo(10.82699966430664,16.378999710083008)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,12.010000228881836)
            }
}

public val LucideIcons.All.FanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Fan: ImageVector
    @Composable get() = FanDefinition.asImageVector()
